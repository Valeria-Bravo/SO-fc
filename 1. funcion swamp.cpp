#include <iostream>
using namespace std;
template <typename T>
void swamp(T &a, T &b){
	T aux;
	aux=a;
	a=b;
	b=aux;
}
int main(){
	int a=5,b=7;
	cout<<"Original :" <<a<<"-"<<b<<endl;
	swamp(a,b);
	cout<<"Cambiado: "<<a<<"-"<<b<<endl;
}
