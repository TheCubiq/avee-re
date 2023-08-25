.class public Lcom/daaw/zo1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zo1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/zo1;->f(Lcom/daaw/a30$c;I)Lcom/daaw/a30$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/zo1$c<",
        "Lcom/daaw/a30$d;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/zo1;


# direct methods
.method public constructor <init>(Lcom/daaw/zo1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zo1$b;->a:Lcom/daaw/zo1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/a30$d;

    invoke-virtual {p0, p1}, Lcom/daaw/zo1$b;->c(Lcom/daaw/a30$d;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/daaw/a30$d;

    invoke-virtual {p0, p1}, Lcom/daaw/zo1$b;->d(Lcom/daaw/a30$d;)Z

    move-result p1

    return p1
.end method

.method public c(Lcom/daaw/a30$d;)I
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/a30$d;->e()I

    move-result p1

    return p1
.end method

.method public d(Lcom/daaw/a30$d;)Z
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/a30$d;->f()Z

    move-result p1

    return p1
.end method
