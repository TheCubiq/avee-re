.class abstract enum Lorg/junit/internal/Throwables$State;
.super Ljava/lang/Enum;
.source "Throwables.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/internal/Throwables;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x440a
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/junit/internal/Throwables$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/junit/internal/Throwables$State;

.field public static final enum DONE:Lorg/junit/internal/Throwables$State;

.field public static final enum PROCESSING_OTHER_CODE:Lorg/junit/internal/Throwables$State;

.field public static final enum PROCESSING_REFLECTION_CODE:Lorg/junit/internal/Throwables$State;

.field public static final enum PROCESSING_TEST_FRAMEWORK_CODE:Lorg/junit/internal/Throwables$State;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 186
    new-instance v0, Lorg/junit/internal/Throwables$State$1;

    const/4 v1, 0x0

    const-string v2, "PROCESSING_OTHER_CODE"

    invoke-direct {v0, v2, v1}, Lorg/junit/internal/Throwables$State$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/junit/internal/Throwables$State;->PROCESSING_OTHER_CODE:Lorg/junit/internal/Throwables$State;

    .line 194
    new-instance v0, Lorg/junit/internal/Throwables$State$2;

    const/4 v2, 0x1

    const-string v3, "PROCESSING_TEST_FRAMEWORK_CODE"

    invoke-direct {v0, v3, v2}, Lorg/junit/internal/Throwables$State$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/junit/internal/Throwables$State;->PROCESSING_TEST_FRAMEWORK_CODE:Lorg/junit/internal/Throwables$State;

    .line 204
    new-instance v0, Lorg/junit/internal/Throwables$State$3;

    const/4 v3, 0x2

    const-string v4, "PROCESSING_REFLECTION_CODE"

    invoke-direct {v0, v4, v3}, Lorg/junit/internal/Throwables$State$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/junit/internal/Throwables$State;->PROCESSING_REFLECTION_CODE:Lorg/junit/internal/Throwables$State;

    .line 215
    new-instance v0, Lorg/junit/internal/Throwables$State$4;

    const/4 v4, 0x3

    const-string v5, "DONE"

    invoke-direct {v0, v5, v4}, Lorg/junit/internal/Throwables$State$4;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/junit/internal/Throwables$State;->DONE:Lorg/junit/internal/Throwables$State;

    const/4 v5, 0x4

    new-array v5, v5, [Lorg/junit/internal/Throwables$State;

    .line 185
    sget-object v6, Lorg/junit/internal/Throwables$State;->PROCESSING_OTHER_CODE:Lorg/junit/internal/Throwables$State;

    aput-object v6, v5, v1

    sget-object v1, Lorg/junit/internal/Throwables$State;->PROCESSING_TEST_FRAMEWORK_CODE:Lorg/junit/internal/Throwables$State;

    aput-object v1, v5, v2

    sget-object v1, Lorg/junit/internal/Throwables$State;->PROCESSING_REFLECTION_CODE:Lorg/junit/internal/Throwables$State;

    aput-object v1, v5, v3

    aput-object v0, v5, v4

    sput-object v5, Lorg/junit/internal/Throwables$State;->$VALUES:[Lorg/junit/internal/Throwables$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 185
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILorg/junit/internal/Throwables$1;)V
    .locals 0

    .line 185
    invoke-direct {p0, p1, p2}, Lorg/junit/internal/Throwables$State;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/junit/internal/Throwables$State;
    .locals 1

    .line 185
    const-class v0, Lorg/junit/internal/Throwables$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/junit/internal/Throwables$State;

    return-object p0
.end method

.method public static values()[Lorg/junit/internal/Throwables$State;
    .locals 1

    .line 185
    sget-object v0, Lorg/junit/internal/Throwables$State;->$VALUES:[Lorg/junit/internal/Throwables$State;

    invoke-virtual {v0}, [Lorg/junit/internal/Throwables$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/junit/internal/Throwables$State;

    return-object v0
.end method


# virtual methods
.method protected abstract processLine(Ljava/lang/String;)Lorg/junit/internal/Throwables$State;
.end method

.method public final processStackTraceElement(Ljava/lang/StackTraceElement;)Lorg/junit/internal/Throwables$State;
    .locals 2

    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "()"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/junit/internal/Throwables$State;->processLine(Ljava/lang/String;)Lorg/junit/internal/Throwables$State;

    move-result-object p1

    return-object p1
.end method
