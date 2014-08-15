printreceipt
============

PrintReceipt is an application to prepare the cart from the given items and apply predefined
tax on the selected items based on the items selected.

eg : Food and Medical items exempted from the tax and rest of the items apply 10% sales tax.
	  Apply 5% sales tax on all imported items. No exemption.
	  

Main Resources :

Cart : Cart object will have the list of items and will calculate the tax on the complete cart for final receipt

Item : Item will have item detail like name and also will have the place holder for computed tax and price and also placeholder for total price

ItemDefine : is the class with the enum class of ItemType to define different types of items for tax calculations.

Main : is the class to run the program using scanner. The current implementation we had kept it for 2 items. 
	   We can make it variable as well. We are currently looping only for two items. We can have this numbrer passed as an argument and use it to decide the limit of the items.
	   
	   
The application can be cloned from 

	https://github.com/manojwazar/printreceipt

It can be run standalone by run as java application for Main.java

If we compile using maven it will package the classes and resources as jar.


eg :


 Select Item : 
1 :DesignPatterns
2 :Music CD
3 :Chocolate
4 :Perfume
5 :Headache Pills

1
Price
10

 Item type: 
0 :BOOK
1 :MEDICAL
2 :FOOD
3 :OTHERS
4 :IMPORTED_BOOK
5 :IMPORTED_MEDICAL
6 :IMPORTED_FOOD
7 :IMPORTED_OTHERS

0
Item with Tax : 11.0
------------------------------------------------- 

Final Sale Receipt 


 Select Item : 
1 :DesignPatterns
2 :Music CD
3 :Chocolate
4 :Perfume
5 :Headache Pills

3
Price
5

 Item type: 
0 :BOOK
1 :MEDICAL
2 :FOOD
3 :OTHERS
4 :IMPORTED_BOOK
5 :IMPORTED_MEDICAL
6 :IMPORTED_FOOD
7 :IMPORTED_OTHERS

2
Item with Tax : 5.0
------------------------------------------------- 

Final Sale Receipt 


1 : Item Name - DesignPatterns : Item Price - 10.0 : Item Tax - 1.0
1 : Item Name - Chocolate : Item Price - 5.0 : Item Tax - 0.0
Sales Tax:1.00
Total :16.0

