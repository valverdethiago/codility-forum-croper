import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setup() {
        this.solution = new Solution();
    }

    @Test
    public void codilityTest() {
        Assert.assertThat(this.solution.solution("Codility We test coders", 14),
                Matchers.equalTo("Codility We"));
    }

    @Test
    public void whyNotTest() {
        Assert.assertThat(this.solution.solution("Why not", 14),
                Matchers.equalTo("Why not"));
    }

    @Test
    public void lazyDogTest() {
        System.out.println("The   quick brown fox jumps over the lazy".length());
        Assert.assertThat(this.solution.solution("  The   quick brown fox jumps over the lazy    dog  ", 39),
                Matchers.equalTo("The   quick brown fox jumps over the"));
    }

    @Test
    public void lazyDogTest2() {
        System.out.println("The quick brown fox jumps over the lazy".length());
        Assert.assertThat(this.solution.solution("The quick brown fox jumps over the lazy dog", 39),
                Matchers.equalTo("The quick brown fox jumps over the lazy"));
    }

    @Test
    public void sameSize() {
        String message = "Codility We test coders";
        Assert.assertThat(this.solution.solution(message, 23),
                Matchers.equalTo(message));
    }

    @Test
    public void emptyMessage() {
        Assert.assertThat(this.solution.solution("", 23), Matchers.equalTo(""));
    }

}
