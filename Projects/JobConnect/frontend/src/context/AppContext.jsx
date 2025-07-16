// src/context/AppContext.js
import { createContext, useEffect, useState } from 'react';
import api from '../api/api'; // ✅ Use centralized API

export const AppContext = createContext();

export const AppContextProvider = ({ children }) => {
  const [searchFilter, setSearchFilter] = useState({
    title: '',
    location: ''
  });

  const [isSearched, setIsSearched] = useState(false);
  const [jobs, setJobs] = useState([]);

  // ✅ Fetch jobs based on current search filter
  const fetchJobs = async () => {
    try {
      const { title, location } = searchFilter;

      const res = await api.get('/candidate/jobs/search', {
        params: {
          title: title || undefined,
          location: location || undefined
        }
      });

      setJobs(res.data);
    } catch (error) {
      console.error('Failed to fetch jobs from backend:', error);
      setJobs([]); // fallback to empty
    }
  };
  useEffect(() => {
  fetchJobs(); 
}, []);

  useEffect(() => {
    if (isSearched) {
      fetchJobs();
    }
  }, [isSearched, searchFilter]);

  const value = {
    searchFilter,
    setSearchFilter,
    isSearched,
    setIsSearched,
    jobs,
    setJobs,
    fetchJobs
  };

  return (
    <AppContext.Provider value={value}>
      {children}
    </AppContext.Provider>
  );
};
