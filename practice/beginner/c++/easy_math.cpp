#include <bits/stdc++.h>
using namespace std;

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	int t;
	cin >> t;

	while(t--){
		int n;
		cin >> n;
		int arr[n];
		vector<int> prod;
		for (int  i = 0; i < n; i++){
			cin >> arr[i];
		}
		for (int i = 0; i < n; i++){
			for (int j = i + 1; j < n; j++) {
				prod.push_back(arr[i] * arr[j]);
			}
		}
		int best = -1;
		for (long long i : prod){
			long long n = i;
			int sum = 0;
			while (n > 0){
				sum += n % 10;
				n /= 10;
			}
			best = max(best, sum);
		}
		cout << best << "\n";
	}
}
