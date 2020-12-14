#include <bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;
	while (t--){
		string r,s;
		int n;
		int sc = 0;
		int rc = 0;
		cin >> n;
		cin >> s >> r;
		for (int i = 0; i < n; i++){
			if (s[i] == '1') sc++;
			if (r[i] == '1') rc++; 
		}

		cout << ((sc == rc) ? "YES" : "NO") << "\n";
	}
}