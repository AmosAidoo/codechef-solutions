#include <bits/stdc++.h>
using namespace std;

typedef long double ld;
int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	int t;
	cin >> t;

	while (t--){
		int n;
		cin >> n;
		int a[n]{0};
		long long sum = 0;
		int pos = 1;
		bool found = false;
		for (int i = 0; i < n; i++){
			cin >> a[i];
			sum += a[i];
		}
		for (int i = 0; i < n; i++){
			if (sum == (long long)a[i] * n){
				pos += i;
				found = true;
				break;
			}
		}

		if (found){
			cout << pos << "\n";
		} else {
			cout << "Impossible" << "\n";
		}
	}
}