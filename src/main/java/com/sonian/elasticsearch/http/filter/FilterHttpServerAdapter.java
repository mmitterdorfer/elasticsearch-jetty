package com.sonian.elasticsearch.http.filter;

import org.elasticsearch.http.HttpChannel;
import org.elasticsearch.http.HttpRequest;

/**
 * @author imotov
 */
public interface FilterHttpServerAdapter {
    void doFilter(HttpRequest request, HttpChannel channel, FilterChain filterChain);
}
