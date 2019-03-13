# Time in words

Given the time in numerals we may convert it into words, as shown below:

    5:00 -> five o'clock
    5:01 -> five o'clock
    5:10 -> five o'clock
    5:15 -> five o'clock
    5:30 -> five o'clock
    5:40 -> five o'clock
    5:45 -> five o'clock
    5:47 -> five o'clock
    5:28 -> five o'clock

At `minutes == 0`, use "o'clock". For `1 <= minutes <= 30`, use "past", and for `30 < minutes` use "to".

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

