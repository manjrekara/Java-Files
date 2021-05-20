public class Comparisons
{
    public static void main(String[] args)
    {
        PersonAgeComparable pac1 = new PersonAgeComparable("Ann", 20);
        PersonAgeComparable pac2 = new PersonAgeComparable("Sue", 17);
        PersonAgeComparable pac3 = new PersonAgeComparable("Alice", 18);

        PersonNameComparable pnc1 = new PersonNameComparable("Lou", 21);
        PersonNameComparable pnc2 = new PersonNameComparable("Dan", 18);
        PersonNameComparable pnc3 = new PersonNameComparable("Bob", 15);

        AccountBalanceComparable abc1 = new AccountBalanceComparable(125.75, "Joe", 156849);
        AccountBalanceComparable abc2 = new AccountBalanceComparable(82.63, "Eric", 832468);
        AccountBalanceComparable abc3 = new AccountBalanceComparable(71.58, "Tom", 752648);

        AccountAccountComparable anc1 = new AccountAccountComparable(425.75, "Stan", 656849);
        AccountAccountComparable anc2 = new AccountAccountComparable(62.63, "Sally", 232468);
        AccountAccountComparable anc3 = new AccountAccountComparable(341.58, "Susan", 552648);

        AccountNameComparable aoc1 = new AccountNameComparable(425.75, "Donna", 956849);
        AccountNameComparable aoc2 = new AccountNameComparable(62.63, "Betty", 132468);
        AccountNameComparable aoc3 = new AccountNameComparable(341.58, "Derek", 112648);

        System.out.print("The largest pac object is: ");
        System.out.println(CompareThree.maxOfThree(pac1, pac2, pac3));
        // compare all 3 PersonAgeComparable objects and output the correct answer 

        System.out.print("The smallest pac object is: ");
        System.out.println(CompareThree.minOfThree(pac1, pac2, pac3));
        // compare all 3 PersonAgeComparable objects and output the correct answer 

        System.out.print("The largest pnc object is: ");
        System.out.println(CompareThree.maxOfThree(pnc1, pnc2, pnc3)); 
        // compare all 3 objects and output the correct answer 

        System.out.print("The smallest pnc object is: ");
        System.out.println(CompareThree.minOfThree(pnc1, pnc2, pnc3));  // compare all 3 objects and output the correct answer

        System.out.print("The largest abc object is: ");
        System.out.println(CompareThree.maxOfThree(abc1, abc2, abc3));  // compare all 3 objects and output the correct answer 

        System.out.print("The smallest abc object is: ");
        System.out.println(CompareThree.minOfThree(abc1, abc2, abc3));  // compare all 3 objects and output the correct answer

        System.out.print("The largest anc object is: ");
        System.out.println(CompareThree.maxOfThree(anc1, anc2, anc3)); // compare all 3 objects and output the correct answer 

        System.out.print("The smallest anc object is: ");
        System.out.println(CompareThree.minOfThree(anc1, anc2, anc3));  // compare all 3 objects and output the correct answer

        System.out.print("The largest aoc object is: ");
        System.out.println(CompareThree.maxOfThree(aoc1, aoc2, aoc3));  // compare all 3 objects and output the correct answer 

        System.out.print("The smallest aoc object is: ");
        System.out.println(CompareThree.minOfThree(aoc1, aoc2, aoc3)); // compare all 3 objects and output the correct answer
    }
}