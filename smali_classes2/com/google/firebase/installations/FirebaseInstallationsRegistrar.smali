.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/bi;)Lcom/daaw/e20;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(Lcom/daaw/bi;)Lcom/daaw/e20;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lcom/daaw/bi;)Lcom/daaw/e20;
    .locals 3

    new-instance v0, Lcom/daaw/d20;

    const-class v1, Lcom/daaw/s10;

    invoke-interface {p0, v1}, Lcom/daaw/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/s10;

    const-class v2, Lcom/daaw/va0;

    invoke-interface {p0, v2}, Lcom/daaw/bi;->d(Ljava/lang/Class;)Lcom/daaw/b01;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/daaw/d20;-><init>(Lcom/daaw/s10;Lcom/daaw/b01;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/vh<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/daaw/vh;

    const-class v1, Lcom/daaw/e20;

    invoke-static {v1}, Lcom/daaw/vh;->e(Ljava/lang/Class;)Lcom/daaw/vh$b;

    move-result-object v1

    const-string v2, "fire-installations"

    invoke-virtual {v1, v2}, Lcom/daaw/vh$b;->g(Ljava/lang/String;)Lcom/daaw/vh$b;

    move-result-object v1

    const-class v3, Lcom/daaw/s10;

    invoke-static {v3}, Lcom/daaw/ys;->j(Ljava/lang/Class;)Lcom/daaw/ys;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/daaw/vh$b;->b(Lcom/daaw/ys;)Lcom/daaw/vh$b;

    move-result-object v1

    const-class v3, Lcom/daaw/va0;

    invoke-static {v3}, Lcom/daaw/ys;->h(Ljava/lang/Class;)Lcom/daaw/ys;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/daaw/vh$b;->b(Lcom/daaw/ys;)Lcom/daaw/vh$b;

    move-result-object v1

    sget-object v3, Lcom/daaw/g20;->a:Lcom/daaw/g20;

    invoke-virtual {v1, v3}, Lcom/daaw/vh$b;->e(Lcom/daaw/gi;)Lcom/daaw/vh$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/vh$b;->c()Lcom/daaw/vh;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    invoke-static {}, Lcom/daaw/ua0;->a()Lcom/daaw/vh;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "17.1.0"

    invoke-static {v2, v1}, Lcom/daaw/kj0;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/vh;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
