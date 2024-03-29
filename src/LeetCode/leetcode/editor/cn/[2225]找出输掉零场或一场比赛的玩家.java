package LeetCode.leetcode.editor.cn;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class leetcode_java_2225 {
    public static void main(String[] args) {
        int[][] matches = {{26651,85186},{19790,34845},{20238,59388},{12788,40994},{46703,28184},{49936,83960},{76158,33038},{96005,2100},{86989,72152},{73342,82931},{90852,54532},{61649,18655},{9506,73692},{56189,5503},{34939,78765},{98315,19818},{57974,42491},{5906,8266},{97215,95437},{48266,87323},{86578,82992},{29919,70323},{38749,98079},{10259,27750},{977,39147},{43625,38229},{56044,32634},{53509,13100},{59446,68045},{38379,7712},{87511,62110},{35456,508},{76381,89490},{73270,55169},{82004,20887},{11239,24195},{56561,57161},{96112,81582},{20403,76188},{77876,61782},{99546,39653},{68650,57489},{27952,11410},{10595,73394},{98154,49624},{10866,3758},{70902,97205},{43360,93218},{59119,82709},{7379,47660},{76950,1884},{20120,87138},{23010,5729},{96553,12208},{70423,36052},{98588,30989},{87447,24694},{90748,39031},{17455,13250},{49557,4501},{99624,72185},{24791,99744},{80458,57635},{16175,29359},{53170,83581},{95936,39348},{5634,95357},{58517,73348},{54861,34521},{86692,23939},{11623,85398},{7562,4748},{13217,29610},{52705,67263},{95277,68332},{50498,96263},{18070,33256},{1901,4237},{11894,97936},{22135,34362},{7698,64698},{22893,62847},{2294,14712},{69996,48778},{340,93723},{42138,33976},{53231,33755},{29512,501},{81773,58971},{19189,20321},{30220,37726},{78678,17938},{79172,26444},{67695,39219},{23206,40923},{5651,8928},{49333,29553},{98589,75052},{99636,94502},{38455,66022},{3654,56685},{42118,65465},{83831,62461},{81301,90996},{35209,23863},{99223,69931},{5206,42971},{2143,97501},{91454,60002},{6307,70975},{48194,6557},{60125,70237},{60551,85062},{58731,86177},{98064,94854},{63923,51970},{87687,36064},{37926,97759},{87685,22212},{62051,7149},{1430,13255},{55928,48428},{8319,99922},{58503,69220},{45821,70178},{56815,31101},{77963,7364},{28828,65658},{92037,99306},{97928,41984},{47086,73658},{35491,79727},{24688,42610},{32304,18289},{52770,31966},{96613,96122},{73643,49573},{27623,89143},{62163,93629},{41018,53285},{59655,4055},{80777,17295},{9744,38601}};
        List<List<Integer>> winners = new leetcode_java_2225().findWinners4(matches);
        System.out.println("winners = " + winners);
    }

    public List<List<Integer>> findWinners(int[][] matches) {
        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int[] item : matches) {
            int winner = item[0];
            int loser = item[1] *= -1;
            if (!hashMap.containsKey(winner)) {
                hashMap.put(winner, 1);
            }
            if (!hashMap.containsKey(loser)) {
                hashMap.put(loser, 1);
            } else {
                hashMap.put(loser, -1);
            }
        }

        hashMap.forEach((key, values) -> {
            int item = key > 0 ? key * -1 : key;
            if (hashMap.containsKey(item)) {
                Integer integer = hashMap.get(item);
                if (integer == 1) {
                    if (!list2.contains(-item))
                        list2.add(-item);
                }
            } else {
                if (!list1.contains(-item))
                    list1.add(-item);
            }
        });
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        ArrayList<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        return list;
    }

    public List<List<Integer>> findWinners2(int[][] matches) {
        int max = 0;
        for (int[] match : matches) {
            for (int i : match) {
                max = Math.max(max, i);
            }
        }
        int[] indegree = new int[max + 1];
        int[] outdegree = new int[max + 1];
        for (int[] match : matches) {
            ++outdegree[match[0]];
            ++indegree[match[1]];
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> allWins = new ArrayList<>();
        List<Integer> oneLoses = new ArrayList<>();
        for (int i = 0; i < max + 1; i++) {
            if (indegree[i] == 0 && outdegree[i] > 0) {
                allWins.add(i);
            } else if (indegree[i] == 1) {
                oneLoses.add(i);
            }
        }
        ans.add(allWins);
        ans.add(oneLoses);
        return ans;
    }

    public List<List<Integer>> findWinners3(int[][] matches) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int[] item:matches) {
            int win = item[0];
            int low = item[1];
            if (!hashMap.containsKey(win))
                hashMap.put(win,1);
            if (!hashMap.containsKey(low))
                hashMap.put(low,0);
            else {
                Integer integer = hashMap.get(low);
                hashMap.put(low,integer-1);
            }
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        hashMap.forEach((key,value)->{
            if (value==1)
                list1.add(key);
            else if (value == 0)
                list2.add(key);
        });
        list1.sort(Integer::compareTo);
        list2.sort(Integer::compareTo);

        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        return list;
    }


    public List<List<Integer>> findWinners4(int[][] matches) {
        // 胜利组
        HashMap<Integer, Integer> map = new HashMap<>();
        // 失败组
        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < matches.length; i++) {
            int[] match = matches[i];
            map.put(match[0], 1);
            map.put(match[0], 1);
            if (map1.keySet().contains(match[1])) {
                Integer integer = map1.get(match[1]);
                integer++;
                map1.put(match[1],integer);
            } else {
                map1.put(match[1], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer integer : map.keySet()) {
            if (!map1.keySet().contains(integer)) {
                list.add(integer);
            }

        }
        ArrayList<Integer> lost = new ArrayList<>();
        for (Integer integer : map1.keySet()) {
            Integer integer1 = map1.get(integer);
            if (integer1 == 1) {
                lost.add(integer);
            }
        }
        ArrayList<List<Integer>> lists = new ArrayList<>();
        list.sort(null);
        lost.sort(null);
        lists.add(list);
        lists.add(lost);

        return lists;
    }
}
