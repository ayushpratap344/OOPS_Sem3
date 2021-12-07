/*
Q13. Create a class named MusicalComposition that contains fields for title, composer, and year written. Include a constructor that requires all three values and an
appropriate display function. The child class NationalAnthem contains an additional
field that holds the name of the anthem's nation. The child class constructor requires a
value for this additional field. The child class also contains a display function. Write a
main() function that instantiates objects of each class and demonstrates that the
functions work correctly.
*/

#include <bits/stdc++.h>
#include <algorithm>
#include <iostream>

using namespace std;

const char nl = '\n';

class MusicalComposition
{
protected:
    string compTitle;
    string composer;
    int yearWritten;

public:
    MusicalComposition(string, string, int);
    void showMusicalComposition();
};
MusicalComposition::MusicalComposition(string title, string cmpsr, int year)
{
    compTitle = title;
    composer = cmpsr;
    yearWritten = year;
}
void MusicalComposition::showMusicalComposition()
{
    cout << "Title: " << compTitle << nl;
    cout << "Composer: " << composer << nl;
    cout << "Year: " << yearWritten << nl;
    cout << nl;
}
class NationalAnthem : public MusicalComposition
{
    string nation;

public:
    NationalAnthem(string title, string cmpsr, int year, string country) : MusicalComposition(title, cmpsr, year)
    {
        nation = country;
    }
    void showMusicalComposition();
};

void NationalAnthem::showMusicalComposition()
{
    cout << "Title: " << compTitle << nl;
    cout << "Composer: " << composer << nl;
    cout << "Year: " << yearWritten << nl;
    cout << "Nation: " << nation << nl;
    cout << nl;
}
int main()
{
    MusicalComposition ayush_01("Gasolina", "Lois Fonsi", 2020);
    MusicalComposition ayush_02("Taki-Taki", "DJ-Snake", 2019);
    NationalAnthem anthem("Jana Gana Mana", "Rabindranath Tagore", 1950, "India");

    ayush_01.showMusicalComposition();
    ayush_02.showMusicalComposition();

    anthem.showMusicalComposition();

    return 0;
}

//this code is written by Ayush Pratap Singh
//BT20CSE212
