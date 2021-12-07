/*
Q14. Create a class named Pizza that stores information about a //single pizza//.
//It should contain the following:
//Private instance variables to store the size of the pizza (either small, medium, or large),
//the number of cheese toppings, the number of pepperoni toppings, and the number of ham toppings.
//Constructor(s) that set all of the instance variables.
//Public methods to get and set the instance variables.
//A public method named calcCost( ) that returns a double that is the cost of the pizza.
//Pizza cost is determined by:
//Small: $10 + $2 per topping
//Medium: $12 + $2 per topping
//Large: $14 + $2 per topping
//A public method named getDescription() that returns a String containing the pizza size,
//quantity of each topping, and the pizza cost as calculated by calcCost().
//getDescription() example:
//large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
//Total Price  : 18.0  
//*/
#include <bits/stdc++.h>
#include <algorithm>
#include <iostream>
#include<string>

using namespace std;

const char nl = '\n';

class Pizza
{
private:
    string sizeofPizza;
    int cheeseToppings;
    int pepperoniToppings;
    int hamToppings;

public:
    Pizza(string, int, int, int);

    // Setter
    void setSize(int s)
    {
        sizeofPizza = s;
    }
    // Getter
    string getSize()
    {
        return sizeofPizza;
    }

    void setCheeseTopping(int cheeseTopping)
    {
        cheeseToppings = cheeseTopping;
    }
    int getCheeseTopping()
    {
        return cheeseToppings;
    }

    void setPepperoniTopping(int pepperoniTopping)
    {
        pepperoniToppings = pepperoniTopping;
    }
    int getPepperoniTopping()
    {
        return pepperoniToppings;
    }

    void setHamTopping(int hamTopping)
    {
        hamToppings = hamTopping;
    }
    int getHamTopping()
    {
        return hamToppings;
    }

    double calcCost()
    {
        transform(sizeofPizza.begin(), sizeofPizza.end(), sizeofPizza.begin(), ::tolower);
        string s1 = "small";
        string s2 = "medium";

        if (sizeofPizza.compare(s1) == 0)
        {
            return (cheeseToppings + pepperoniToppings + hamToppings) * 2 + 10;
        }
        else if (sizeofPizza.compare(s2) == 0)
        {
            return (cheeseToppings + pepperoniToppings + hamToppings) * 2 + 12;
        }
        else
        {
            return (cheeseToppings + pepperoniToppings + hamToppings) * 2 + 14;
        }
    }

    string getDescription()
    {
        return "You ordered a Pizza of size " + sizeofPizza + " with " + to_string(cheeseToppings)  + " Cheese toppings, " + to_string(pepperoniToppings) + " Pepperoni toppings and " + to_string(hamToppings) + " Ham toppings." +             "\nTotal Price: $" + to_string(calcCost());
    }
};

Pizza::Pizza(string size, int cheeseTopping, int pepperoniTopping, int hamTopping)
{
    sizeofPizza = size;
    cheeseToppings = cheeseTopping;
    pepperoniToppings = pepperoniTopping;
    hamToppings = hamTopping;
}

int main()
{
    Pizza ayush_01("small",1,1,1);
    cout<<ayush_01.getDescription()<<nl;
    cout<<nl;

    Pizza ayush_02("large",1,1,2);
    cout<<ayush_02.getDescription()<<nl;
    cout<<nl;
    //cout<<ayush_02.calcCost();

    Pizza ayush_03("MEDIUM",5,5,5);
    cout<<ayush_03.getDescription()<<nl;
    cout<<nl;
}

//this code is written by Ayush Pratap Singh
//BT20CSE212
