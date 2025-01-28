#include <iostream>
using namespace std;

class Animal{
    public:
        virtual void sound(){
            cout<<"Animals makes a Sound";
        }
};

class Dog : public Animal{
    public:
        void sound ()override{
            cout<<"Dog Barks";
        }
};

class Cat : public Animal{
    public:
        void sound()override{
            cout<<"Cat Meows";
        }
};

int main (){
    Animal* myAnimal;
    Dog dog;
    Cat cat;

    myAnimal = &dog;
    myAnimal ->sound();
    return 0;
}