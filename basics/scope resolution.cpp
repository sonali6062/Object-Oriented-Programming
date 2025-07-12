#include<bits/stdc++.h>
using namespace std;
// int a=10;
// int main(){
//     int a =100;
//     cout<<a<<endl;
//     cout<<::a<<endl;//to access global variable value
//     return 0;
// }
//to access the global variable along with local variable in the same function
class A{
    public:
    void chem(){
        cout<<"Class a chem"<<endl;
    }
};
class B{
    public:
    void chem(){
        cout<<"Class b chem"<<endl;
    }
};
class C:public A,public B{
    public:
    void math(){
        cout<<"Maths mark"<<endl;
    }
};
int main(){
    C obj;
    obj.A::chem();
    obj.B::chem();
    return 0;
}
//ambiguity is a  problem that can be resolved either using the virtual function or scope resolution operator
