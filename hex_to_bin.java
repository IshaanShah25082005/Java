import java.util.Scanner;

public class hex_to_bin{

public static void main(String[] args){
	
// HEXADECIMAL TO DECIMAL.

Scanner sc = new Scanner(System.in);
	
System.out.println ("Enter the hexadecimal number");

String HexNum = sc.nextLine();
System.out.println ("The Hexadecimal Number is " + HexNum);

int HexNumSize = HexNum.length();

int DecFaceVal = 0;
int DecPlaceVal = 0;
int DecVal = 0;
int DecNum = 0;

for (int i1 = 1; i1 <= HexNumSize; i1++) {

char HexNums = HexNum.charAt(i1-1);

switch (HexNums){
case '0': DecFaceVal = 0;
break;
case '1': DecFaceVal = 1;
break;
case '2': DecFaceVal = 2;
break;
case '3': DecFaceVal = 3;
break;
case '4': DecFaceVal = 4;
break;
case '5': DecFaceVal = 5;
break;
case '6': DecFaceVal = 6;
break;
case '7': DecFaceVal = 7;
break;
case '8': DecFaceVal = 8;
break;
case '9': DecFaceVal = 9;
break;
case 'A': DecFaceVal = 10;
break;
case 'a': DecFaceVal = 10;
break;
case 'B': DecFaceVal = 11;
break;
case 'b': DecFaceVal = 11;
break;
case 'C': DecFaceVal = 12;
break;
case 'c': DecFaceVal = 12;
break;
case 'D': DecFaceVal = 13;
break;
case 'd': DecFaceVal = 13;
break;
case 'E': DecFaceVal = 14;
break;
case 'e': DecFaceVal = 14;
break;
case 'F': DecFaceVal = 15;
break;
case 'f': DecFaceVal = 15;
break;
default: System.out.println ("ERROR: Invalid Input");
}

DecPlaceVal = (int)Math.pow((double)16, (double)(HexNumSize-i1));

DecVal = DecFaceVal*DecPlaceVal;

DecNum = DecNum + DecVal;

}

System.out.println ("The Decimal Number is " + DecNum);

// DECIMAL TO BINARY.

int BinQuo = DecNum;
int BinRem = 0;
String StrRem;
String BinNum = "";

do{

BinQuo = BinQuo/2;
BinRem = BinQuo%2;
StrRem = Integer.toString (BinRem);
BinNum = StrRem + BinNum;

}while (BinQuo >= 2);

System.out.println ("The Binary Number is " + BinNum);

}

}