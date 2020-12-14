#include <bits/stdc++.h>
using namespace std;
#define psi pair<string, int>
int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	int t;
	cin >> t;
	while(t--){
		map<string, int> goals, points, gd;
		typedef function<bool(psi,psi)> Predicate;
		for (int i = 1; i <= 12; i++){
			string homeTeam, awayTeam, ignoreVs;
			int homeScore, awayScore;
			cin >> homeTeam;
			cin >> homeScore;
			cin >> ignoreVs;
			cin >> awayScore;
			cin >> awayTeam;
			goals[homeTeam] += homeScore;
			goals[awayTeam] += awayScore;
			gd[homeTeam] += (homeScore - awayScore);
			gd[awayTeam] += (awayScore - homeScore);
			if (homeScore > awayScore) points[homeTeam] += 3;
			else if (homeScore < awayScore) points[awayTeam] += 3;
			else {
				points[homeTeam] +=  1; 
				points[awayTeam] +=  1;
			}
		}
		Predicate desc = [&gd](psi a, psi b) -> bool {
			if(a.second > b.second) return true;
			if(a.second < b.second) return false;
			if (a.second == b.second) return gd[a.first] > gd[b.first];
			return false;
		};
		set<pair<string, int>, Predicate> porder(points.begin(), points.end(), desc);
		auto po = porder.begin();
		auto f = po,s = ++po;
		cout << (*f).first << " " << (*s).first << "\n";
	}
}
