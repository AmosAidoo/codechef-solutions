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
		long long ncpy = n;
		int sum = 0;
		while (ncpy > 0) {
			sum += ncpy % 10;
			ncpy /= 10;
		}
		int i;
		for (i = 0; i < 10; i++) {
			if ((sum + i) % 10 == 0) break;
		}
		cout << n << i << "\n";
	}
}
