namespace scala com.gu.flexibleoctopus.model.thrift


/** date times are reprsented as i64 - epoch millis */
typedef i64 DateTime

struct StoryBundle {

    1: required i64 id;

    2: required string composerId;

    3: required string pubCode;

    4: required string sectionCode;

    5: required Article article;

}

struct Article {

    1: required i64 id;

    2: required i64 bookSectionId;

    3: required string forPublication;

    4: required string inUseBy; 

    5: required bool isCheckedOut;

    6: required DateTime lastModified;

    7: required string lawyered;

    8: required string objectType;

    9: required i64 onPage;

    10: required DateTime pubDate;

    11: required string status;

}