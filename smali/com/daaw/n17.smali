.class public abstract Lcom/daaw/n17;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/n17;

.field public static final b:Lcom/daaw/n17;

.field public static final c:Lcom/daaw/n17;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/l17;

    invoke-direct {v0}, Lcom/daaw/l17;-><init>()V

    sput-object v0, Lcom/daaw/n17;->a:Lcom/daaw/n17;

    new-instance v0, Lcom/daaw/m17;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lcom/daaw/m17;-><init>(I)V

    sput-object v0, Lcom/daaw/n17;->b:Lcom/daaw/n17;

    new-instance v0, Lcom/daaw/m17;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/daaw/m17;-><init>(I)V

    sput-object v0, Lcom/daaw/n17;->c:Lcom/daaw/n17;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/l17;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic f()Lcom/daaw/n17;
    .locals 1

    sget-object v0, Lcom/daaw/n17;->b:Lcom/daaw/n17;

    return-object v0
.end method

.method public static synthetic g()Lcom/daaw/n17;
    .locals 1

    sget-object v0, Lcom/daaw/n17;->c:Lcom/daaw/n17;

    return-object v0
.end method

.method public static synthetic h()Lcom/daaw/n17;
    .locals 1

    sget-object v0, Lcom/daaw/n17;->a:Lcom/daaw/n17;

    return-object v0
.end method

.method public static i()Lcom/daaw/n17;
    .locals 1

    sget-object v0, Lcom/daaw/n17;->a:Lcom/daaw/n17;

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b(II)Lcom/daaw/n17;
.end method

.method public abstract c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/daaw/n17;
.end method

.method public abstract d(ZZ)Lcom/daaw/n17;
.end method

.method public abstract e(ZZ)Lcom/daaw/n17;
.end method
