package be.pxl.rct.visitor;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.NotImplementedException;

import java.util.Random;

public class VisitorFactory {

    private static final Random RANDOM = new Random();
    private static final Faker FAKER = new Faker();

    public final Visitor createVisitor() {
        throw new NotImplementedException("Method currently not implemented");
    }
}
