#include <bits/stdc++.h>
using namespace std;

int main(){

	int t;
	cin >> t;

	while (t--){
		int n, m, d, v, mm = 100000;
		cin >> n >> m;

		int taste[100001]{0};
		while (n--){
			cin >> d >> v;
			taste[d] = max(v, taste[d]);
		}

		sort(taste, taste+mm);
		cout << taste[mm-1] + taste[mm - 2] << "\n";

	}
}