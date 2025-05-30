public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            int x = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (k > nums[j]) {
                    k = nums[j];
                    x = j;
                }
            }
            int t = nums[i];
            nums[i] = k;
            nums[x] = t;

            if(target == k){
                a.add(i);
            }

        }

        for(int i :a){
            System.out.println(i);
        }

        return a;

    }
