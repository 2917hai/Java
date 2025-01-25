#include <iostream>
using namespace std;
int main()
{
  int no;
  cout<<("\n\n\t  1). play game");
  cout<<("\n\n\t 2). load game");
  cout<<("\n\n\t  3). player");
cout<<("\n\n\t  4). exit");
cout<<("\n\n\n  select your choice");
cin>>no;
switch(no)
{
	case 1:
	cout<<(" play game");
	break;	
	case 2:
	cout<<(" load game");
	break;
	case 3:
	cout<<(" player");
	break;
	case 4:
	cout<<(" exit");
	break;
	default:
    cout<<(" wrong input");
    break;
		
}

return 0;
}
