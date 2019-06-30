#include <bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;

	while(t--){
		int n;
		cin >> n;
		string key, ans;
		cin >> key >> ans;
		int mark = 0;
		int contPos = -1;
		for (int i = 0; i < n; i++){
			if (contPos == i) continue;

			if (ans[i] == key[i]) mark++;
			else if (ans[i] == 'N') continue;
			else if (key[i] != ans[i]) contPos = i + 1;
		}

		cout << mark << "\n";
	}
}