package Lab5;

public class DaiHoc {
    private String schoolName;
    private double admissionScore;

    public DaiHoc(String schoolName, double admissionScore) {
        this.schoolName = schoolName;
        this.admissionScore = admissionScore;
    }

        public String xetTuyen (ThiSinh thiSinh) {
            String result = "";

            if (thiSinh.tinhDXT() >= admissionScore && !thiSinh.check()) {
                result = String.format("Congratulation %s %d pass into %s ",
                        thiSinh.getName(), thiSinh.getId(), schoolName);
            } else result = String.format("Regret %s %d no pass into %s ",
                    thiSinh.getName(), thiSinh.getId(), schoolName);

            return result;
        }
}

