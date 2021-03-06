namespace scala com.gu.flexibleoctopus.model.thrift

/** date times are reprsented as i64 - epoch millis */
typedef i64 DateTime

/** dates are reprsented as i64 - epoch days */
typedef i64 Date

/** 
* A single story bundle that maps directly to a piece of content in Composer 
*/
struct StoryBundle {

    1: required i64 id;

    2: required string composerId;

    3: required string publicationCode;

    4: required string sectionCode;

    5: required Article bodyText;

    6: optional Article headline;

    // the primary page that the article is on 
    7: optional i64 pageNumber;

    // the date of publication
    8: optional Date printPublicationDate;

    // octopus id for the layout the article is attached to
    9: optional string octopusLayoutId;
}

/** The legal statues of an article */
enum Lawyered {
    NOTAPPLICABLE = 0,
    PENDING = 1,
    CLEARED = 2,
    PRIORITY = 3 
}

/** Where an article is going to be published */
enum ForPublication {
    WEB = 0,
    PRINT = 1,
    BOTH = 2
}

/** The workflow statuses of the article */ 
enum ArticleStatus {
    CHIEFSUB = 0,
    DESK = 1,
    FINALLED = 2,
    HOLD = 3,
    KILLED = 4,
    REVISESUB = 5,
    SUBS = 6,
    WRITERS = 7
}

/**
* Represents a single article of a story bundle as generated by inCopy, 
* such as the headline, standfirst, or body text
*/
struct Article {

    1: required i64 id;

    // indicates whether the article is for web and/or print pulication
    2: required ForPublication forPublication;

    // current user that has the article checked out
    3: optional string inUseBy; 

    // whether the article is currently checked out by a user
    4: required bool isCheckedOut;

    // when the last version of the article was saved
    5: required DateTime lastModified;

    // current legal status of the article
    6: required Lawyered lawyered;

    // the workflow status of the article
    7: required ArticleStatus status;

    // file name including suffix, a composite of story_group, object type and object number
    8: required string filename;

    // the last user who updated the article
    9: required string lastModifiedBy
}