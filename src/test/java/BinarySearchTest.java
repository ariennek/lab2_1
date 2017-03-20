import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Krzysztof Zimny on 3/20/2017.
 */
public class BinarySearchTest {

    @Test
    public void elementIsInSequenceTest() {
        int sequence[] = new int[]{2};
        int key = 2;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertTrue(searchResult.getPosition() == 1);
    }

    @Test
    public void elementIsNotInSequenceTest() {
        int sequence[] = new int[]{2};
        int key = 1;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        Assert.assertTrue(!searchResult.isFound());
        Assert.assertTrue(searchResult.getPosition() == -1);
    }

    @Test
    public void elementIsFirstInSequenceTest() {
        int sequence[] = new int[]{2,4,5};
        int key = 2;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertTrue(searchResult.getPosition() == 1);
    }

    @Test
    public void elementIsLastInSequenceTest() {
        int sequence[] = new int[]{2,4,5};
        int key = 5;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertTrue(searchResult.getPosition() == sequence.length);
    }
}
