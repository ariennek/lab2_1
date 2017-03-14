package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 195035 on 14.03.2017.
 */
public class BinarySearchTest {

    @Test
    public void testSearch_OneElement_Present() {
        int searched = 69;
        int[] seq = new int[]{searched};

        SearchResult result = BinarySearch.search(searched, seq);

        assertTrue(result.isFound());
        assertEquals(0, result.getPosition());
    }

    @Test
    public void testSearch_OneElement_NotPresent() throws Exception {
        int searched = 69;
        int[] seq = new int[]{searched};

        SearchResult result = BinarySearch.search(searched - 1, seq);

        assertFalse(result.isFound());
        assertEquals(-1, result.getPosition());

    }

    @Test
    public void testSearch_ManyElements_IsFirst() throws Exception {
        int searched = 69;
        int[] seq = new int[]{searched, 80, 95};

        SearchResult result = BinarySearch.search(searched, seq);

        assertTrue(result.isFound());
        assertEquals(0, result.getPosition());

    }
}