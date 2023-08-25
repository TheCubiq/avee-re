.class public final Lcom/daaw/j01;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/j01$b;,
        Lcom/daaw/j01$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/rt8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/j01$a;Lcom/daaw/jc3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/j01$a;->c(Lcom/daaw/j01$a;)Lcom/daaw/rt8;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/j01;->a:Lcom/daaw/rt8;

    return-void
.end method

.method public static a()Lcom/daaw/j01$a;
    .locals 2

    new-instance v0, Lcom/daaw/j01$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/j01$a;-><init>(Lcom/daaw/w83;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/daaw/rt8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j01;->a:Lcom/daaw/rt8;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/j01;->a:Lcom/daaw/rt8;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/j01$b;

    invoke-virtual {v0}, Lcom/daaw/j01$b;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
