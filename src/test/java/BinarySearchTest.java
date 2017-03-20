import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Krzysztof Zimny on 3/20/2017.
 */
public class BinarySearchTest {

    @Test
    public void elementIsInSequenceTest() {
        int sequence[] = new int[]{2};
        int key = 2;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        Assert.assertThat(searchResult.isFound(), is(equalTo(true)));
        Assert.assertThat(searchResult.getPosition() == 1, is(equalTo(true)));
    }



    @Test
    public void elementIsNotInSequenceTest() {
        int sequence[] = new int[]{2};
        int key = 1;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        Assert.assertThat(searchResult.isFound(), is(equalTo(false)));
        Assert.assertThat(searchResult.getPosition() == -1, is(equalTo(true)));
    }

    @Test
    public void elementIsFirstInSequenceTest() {
        int sequence[] = new int[]{2, 4, 5};
        int key = 2;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        Assert.assertThat(searchResult.isFound(), is(equalTo(true)));
        Assert.assertThat(searchResult.getPosition() == 1, is(equalTo(true)));
    }

    @Test
    public void elementIsLastInSequenceTest() {
        int sequence[] = new int[]{2, 4, 5};
        int key = 5;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        Assert.assertThat(searchResult.isFound(), is(equalTo(true)));
        Assert.assertThat(searchResult.getPosition() == sequence.length, is(equalTo(true)));
    }

    @Test
    public void elementIsInTheMiddleOfSequenceTest() {
        int sequence[] = new int[]{2, 4, 5};
        int key = 4;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        Assert.assertThat(searchResult.isFound(), is(equalTo(true)));
        Assert.assertThat(searchResult.getPosition() == 2, is(equalTo(true)));
    }

    @Test
    public void elementIsNotInSequenceWithMoreThanOneElementTest() {
        int sequence[] = new int[]{2, 4, 5};
        int key = 6;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        Assert.assertThat(searchResult.isFound(), is(equalTo(false)));
        Assert.assertThat(searchResult.getPosition() == -1, is(equalTo(true)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void sequenceIsEmptyExceptionTest() {
        int sequence[] = new int[]{};
        int key = 6;
        SearchResult searchResult = BinarySearch.search(key, sequence);
    }
}
