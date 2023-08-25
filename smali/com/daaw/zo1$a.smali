.class public Lcom/daaw/zo1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zo1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/zo1;->h([Lcom/daaw/b30$b;I)Lcom/daaw/b30$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/zo1$c<",
        "Lcom/daaw/b30$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/zo1;


# direct methods
.method public constructor <init>(Lcom/daaw/zo1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zo1$a;->a:Lcom/daaw/zo1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/b30$b;

    invoke-virtual {p0, p1}, Lcom/daaw/zo1$a;->c(Lcom/daaw/b30$b;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/daaw/b30$b;

    invoke-virtual {p0, p1}, Lcom/daaw/zo1$a;->d(Lcom/daaw/b30$b;)Z

    move-result p1

    return p1
.end method

.method public c(Lcom/daaw/b30$b;)I
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/b30$b;->e()I

    move-result p1

    return p1
.end method

.method public d(Lcom/daaw/b30$b;)Z
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/b30$b;->f()Z

    move-result p1

    return p1
.end method
