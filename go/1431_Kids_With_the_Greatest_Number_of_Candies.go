func getMostCandyNumber(candies []int) int {
    mostCandyNumber := candies[0]
    for i := 1; i < len(candies); i++ {
        if candies[i] > mostCandyNumber {
            mostCandyNumber = candies[i]
        }
    }
    return mostCandyNumber;
}

func kidsWithCandies(candies []int, extraCandies int) []bool {
    isGreatest := make([]bool, len(candies))
    mostCandyNumber := getMostCandyNumber(candies)
    for i := 0; i < len(candies); i++ {
        if candies[i] + extraCandies >= mostCandyNumber {
            isGreatest[i] = true
        }
    }
    return isGreatest
}