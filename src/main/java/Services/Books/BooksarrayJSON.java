
package Services.Books;

public class BooksarrayJSON {
    static class Books{
        private int BookID;
        private String BookName;
        private String BookAuthor;
        private String BookCondition;
        private String BookUniversity;
        private String BookSchool;
        private String BookDescription;
        private String BookISBN13;
        private String BookISBN10;
        private String BookImages;
        private String BookCourse;

        /**
         * @return the BookID
         */
        public int getBookID() {
            return BookID;
        }

        /**
         * @param BookID the BookID to set
         */
        public void setBookID(int BookID) {
            this.BookID = BookID;
        }

        /**
         * @return the BookName
         */
        public String getBookName() {
            return BookName;
        }

        /**
         * @param BookName the BookName to set
         */
        public void setBookName(String BookName) {
            this.BookName = BookName;
        }

        /**
         * @return the BookAuthor
         */
        public String getBookAuthor() {
            return BookAuthor;
        }

        /**
         * @param BookAuthor the BookAuthor to set
         */
        public void setBookAuthor(String BookAuthor) {
            this.BookAuthor = BookAuthor;
        }

        /**
         * @return the BookCondition
         */
        public String getBookCondition() {
            return BookCondition;
        }

        /**
         * @param BookCondition the BookCondition to set
         */
        public void setBookCondition(String BookCondition) {
            this.BookCondition = BookCondition;
        }

        /**
         * @return the BookUniversity
         */
        public String getBookUniversity() {
            return BookUniversity;
        }

        /**
         * @param BookUniversity the BookUniversity to set
         */
        public void setBookUniversity(String BookUniversity) {
            this.BookUniversity = BookUniversity;
        }

        /**
         * @return the BookSchool
         */
        public String getBookSchool() {
            return BookSchool;
        }

        /**
         * @param BookSchool the BookSchool to set
         */
        public void setBookSchool(String BookSchool) {
            this.BookSchool = BookSchool;
        }

        /**
         * @return the BookDescription
         */
        public String getBookDescription() {
            return BookDescription;
        }

        /**
         * @param BookDescription the BookDescription to set
         */
        public void setBookDescription(String BookDescription) {
            this.BookDescription = BookDescription;
        }

        /**
         * @return the BookISBN13
         */
        public String getBookISBN13() {
            return BookISBN13;
        }

        /**
         * @param BookISBN13 the BookISBN13 to set
         */
        public void setBookISBN13(String BookISBN13) {
            this.BookISBN13 = BookISBN13;
        }

        /**
         * @return the BookISBN10
         */
        public String getBookISBN10() {
            return BookISBN10;
        }

        /**
         * @param BookISBN10 the BookISBN10 to set
         */
        public void setBookISBN10(String BookISBN10) {
            this.BookISBN10 = BookISBN10;
        }

        /**
         * @return the BookImages
         */
        public String getBookImages() {
            return BookImages;
        }

        /**
         * @param BookImages the BookImages to set
         */
        public void setBookImages(String BookImages) {
            this.BookImages = BookImages;
        }

        /**
         * @return the BookCourse
         */
        public String getBookCourse() {
            return BookCourse;
        }

        /**
         * @param BookCourse the BookCourse to set
         */
        public void setBookCourse(String BookCourse) {
            this.BookCourse = BookCourse;
        }
        @Override
                    public String toString() {
                            return com.google.common.base.Objects.toStringHelper(this)
                                            .add("BookID", BookID).add("BookName", BookName).add("BookAuthor", BookAuthor)
                                    .add("BookCondition", BookCondition).add("BookUniversity", BookUniversity)
                                    .add("BookSchool", BookSchool).add("BookDescription", BookDescription)
                                    .add("BookISBN13", BookISBN13).add("BookISBN10", BookISBN10)
                                    .add("BookImages", BookImages).add("BookCourse", BookCourse).toString();
                    }

    }
}

