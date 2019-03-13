# Time in words

Given the time in numerals we may convert it into words, as shown below:

    5:00 -> five o'clock
    5:01 -> one minute past five
    5:10 -> ten minutes past five
    5:15 -> quarter past five
    5:30 -> half past five
    5:40 -> twenty minutes to six
    5:45 -> quarter to six
    5:47 -> thirteen minutes to six
    5:28 -> twenty eight minutes past five

- At `minutes == 0` use "o'clock"
- For `1 <= minutes <= 30` use "past"
- For `30 < minutes` use "to".
- The word "minute(s)" can be singular or plural.

## Function Description

Complete the `timeInWords` function below. It should return the time in words for the input given in the format described.

```java
String timeInWords(int h, int m) {
}
```

`timeInWords` has the following parameter(s):

 - `h`: an integer representing hour of the day (`1 <= h <= 12`)
 - `m`: an integer representing minutes after the hour (`0 <= m <= 60`)

## Samples

### Inputs

    5:47
    3:00
    7:15

### Outputs
    thirteen minutes to six
    three o'clock
    quarter past seven

