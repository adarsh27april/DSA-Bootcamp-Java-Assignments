#include<iostream>

class A{
   int a;
   void print(){

   }
};

class B{
   int a;
   virtual void print(){

   }
};

int main(){
   std::cout<<sizeof(A)<<std::endl;
   std::cout<<sizeof(B)<<std::endl;
   std::cout<<sizeof("abcd")<<std::endl;
}
