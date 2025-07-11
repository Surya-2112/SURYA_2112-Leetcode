class Room {
    int number, end;
    Room(int number, int end) {
        this.number = number;
        this.end = end;
    }
}

class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        // Available room numbers sorted by room number
        PriorityQueue<Integer> availableRooms = new PriorityQueue<>();

        // Busy rooms: sorted by end time first, then room number
        PriorityQueue<Room> busyRooms = new PriorityQueue<>((a, b) -> {
            if (a.end != b.end) return Integer.compare(a.end, b.end);
            return Integer.compare(a.number, b.number);
        });

        // Initialize available room numbers
        for (int i = 0; i < n; i++) availableRooms.add(i);

        // Count how many times each room is booked
        int[] roomMeetingCount = new int[n];

        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];

            // Free up rooms that have finished their meeting
            while (!busyRooms.isEmpty() && busyRooms.peek().end <= start) {
                availableRooms.add(busyRooms.poll().number);
            }

            if (!availableRooms.isEmpty()) {
                int roomNum = availableRooms.poll();
                busyRooms.add(new Room(roomNum, end));
                roomMeetingCount[roomNum]++;
            } else {
                // Delay the meeting to the earliest ending room's end time
                Room room = busyRooms.poll();
                int newEnd = room.end + (end - start);  // delay meeting
                busyRooms.add(new Room(room.number, newEnd));
                roomMeetingCount[room.number]++;
            }
        }

        // Find the most booked room
        int maxCount = 0, resultRoom = 0;
        for (int i = 0; i < n; i++) {
            if (roomMeetingCount[i] > maxCount) {
                maxCount = roomMeetingCount[i];
                resultRoom = i;
            }
        }
        return resultRoom;
    }
}
