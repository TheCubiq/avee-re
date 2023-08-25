.class public Lcom/daaw/n31;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/daaw/di0;
    .locals 1

    new-instance v0, Lcom/daaw/rf;

    invoke-direct {v0, p1}, Lcom/daaw/rf;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public b(Ljava/lang/Class;Ljava/lang/String;)Lcom/daaw/ei0;
    .locals 1

    new-instance v0, Lcom/daaw/jv0;

    invoke-direct {v0, p1, p2}, Lcom/daaw/jv0;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-object v0
.end method

.method public c(Lcom/daaw/oz0;)Lcom/daaw/fi0;
    .locals 0

    return-object p1
.end method

.method public d(Lcom/daaw/w50;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "kotlin.jvm.functions."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x15

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public e(Lcom/daaw/si0;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/n31;->d(Lcom/daaw/w50;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
