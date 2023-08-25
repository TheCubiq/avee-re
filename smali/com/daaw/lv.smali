.class public Lcom/daaw/lv;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/lv$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/daaw/lv;


# instance fields
.field public final a:Ljava/lang/String;

.field public b:[Lcom/daaw/lv$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/lv;

    const-string v1, "Unnamed"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/lv;->c:Lcom/daaw/lv;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lv;->a:Ljava/lang/String;

    new-array p1, p2, [Lcom/daaw/lv$a;

    iput-object p1, p0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    return-void
.end method

.method public static a(Lcom/daaw/lv;)Lcom/daaw/lv;
    .locals 6

    new-instance v0, Lcom/daaw/lv;

    iget-object v1, p0, Lcom/daaw/lv;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v2, v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    iget-object v3, v0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v4, Lcom/daaw/lv$a;

    aget-object v5, v2, v1

    iget v5, v5, Lcom/daaw/lv$a;->a:F

    aget-object v2, v2, v1

    iget v2, v2, Lcom/daaw/lv$a;->b:F

    invoke-direct {v4, v5, v2}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static b(Ljava/lang/String;)Lcom/daaw/lv;
    .locals 4

    const-string v0, ";"

    invoke-static {v0, p0}, Lcom/daaw/er1;->a(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lcom/daaw/lv;

    array-length v1, p0

    const-string v2, "Default"

    invoke-direct {v0, v2, v1}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    iget-object v2, v0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    aget-object v3, p0, v1

    invoke-static {v3}, Lcom/daaw/lv$a;->a(Ljava/lang/String;)Lcom/daaw/lv$a;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static e(Lcom/daaw/lv;)Ljava/lang/String;
    .locals 1

    iget-object p0, p0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    const-string v0, ";"

    invoke-static {v0, p0}, Lcom/daaw/er1;->d(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c(F)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    iget v4, v3, Lcom/daaw/lv$a;->b:F

    div-float/2addr v4, p1

    iput v4, v3, Lcom/daaw/lv$a;->b:F

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d(I)V
    .locals 0

    new-array p1, p1, [Lcom/daaw/lv$a;

    iput-object p1, p0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    return-void
.end method
