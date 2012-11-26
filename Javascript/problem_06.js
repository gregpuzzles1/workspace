/*Finds the difference between the sum of the
  squares of the first one hundred natural numbers
  and the square of the sum.
*/
var sum_of_squares = 0;
var square_of_sum = 0;
var sum_ = 0;
for(var i = 1; i <= 100; i++){
	var square = Math.pow(i, 2);
	sum_of_squares += square;
	sum_ += i;
}
square_of_sum = Math.pow(sum_, 2);
document.write("sum_of_squares = ", sum_of_squares, "<br \>");
document.write("square_of_sum = ", square_of_sum, "<br \>");
var difference= square_of_sum - sum_of_squares;
document.write("difference = ", difference, "<br \>");