public interface InterestRate {

    // Return base rate
    default double getBaseRate(){
        return 2.5d;
    }
}
