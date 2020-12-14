#include <bits/stdc++.h>
using namespace std;

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	int t;
	cin >> t;
	while(t--) {
		long long n;
		cin >> n;
		cout << n;
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		int a = (10 - sum%10);
		a = (a == 10) ? 0 : a;
		cout << a << "\n";
	}
}
