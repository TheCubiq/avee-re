.class public Lcom/daaw/jv1$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/uw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/jv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/uw1$a<",
        "Lcom/daaw/al;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/vn;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/jv1;


# direct methods
.method public constructor <init>(Lcom/daaw/jv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jv1$e;->a:Lcom/daaw/jv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/al;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Integer;

    check-cast p4, Lcom/daaw/vn;

    check-cast p5, Ljava/lang/String;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/jv1$e;->b(Lcom/daaw/al;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/daaw/vn;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/daaw/al;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/daaw/vn;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/jv1$e;->a:Lcom/daaw/jv1;

    invoke-virtual {p1, p4, p5}, Lcom/daaw/jv1;->c(Lcom/daaw/vn;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/jv1$e;->a:Lcom/daaw/jv1;

    const/4 p2, 0x1

    const/4 p3, -0x1

    invoke-static {p1, p4, p2, p3}, Lcom/daaw/jv1;->b(Lcom/daaw/jv1;Lcom/daaw/vn;ZI)V

    return-void
.end method
