package src.ss9_testing.thuc_hanh.triangle_classification;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassficationTest {
    private final TriangleClassifier classifier = new TriangleClassifier();

    @Test
    void testNotATriangle() {
        assertEquals("Không phải là tam giác", classifier.classifyTriangle(1, 2, 3));
        assertEquals("Không phải là tam giác", classifier.classifyTriangle(0, 1, 1));
        assertEquals("Không phải là tam giác", classifier.classifyTriangle(-1, 2, 3));
    }

    @Test
    void testEquilateralTriangle() {
        assertEquals("Tam giác đều", classifier.classifyTriangle(2, 2, 2));
    }

    @Test
    void testIsoscelesTriangle() {
        assertEquals("Tam giác cân", classifier.classifyTriangle(3, 3, 2));
        assertEquals("Tam giác cân", classifier.classifyTriangle(2, 3, 3));
    }

    @Test
    void testScaleneTriangle() {
        assertEquals("Tam giác thường", classifier.classifyTriangle(3, 4, 5));
    }
}

