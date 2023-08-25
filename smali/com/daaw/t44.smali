.class public final Lcom/daaw/t44;
.super Lcom/daaw/eh2;
.source ""


# static fields
.field public static final c:Lcom/daaw/t44;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/t44;

    invoke-direct {v0}, Lcom/daaw/t44;-><init>()V

    sput-object v0, Lcom/daaw/t44;->c:Lcom/daaw/t44;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/eh2;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;[BLjava/lang/String;)Lcom/daaw/ih2;
    .locals 0

    const-string p2, "moov"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p1, Lcom/daaw/kh2;

    invoke-direct {p1}, Lcom/daaw/kh2;-><init>()V

    return-object p1

    :cond_0
    const-string p2, "mvhd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p1, Lcom/daaw/lh2;

    invoke-direct {p1}, Lcom/daaw/lh2;-><init>()V

    return-object p1

    :cond_1
    new-instance p2, Lcom/daaw/mh2;

    invoke-direct {p2, p1}, Lcom/daaw/mh2;-><init>(Ljava/lang/String;)V

    return-object p2
.end method
