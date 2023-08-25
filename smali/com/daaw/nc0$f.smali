.class public Lcom/daaw/nc0$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/nc0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Lcom/daaw/al;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/nc0;


# direct methods
.method public constructor <init>(Lcom/daaw/nc0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nc0$f;->a:Lcom/daaw/nc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/al;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/nc0$f;->a:Lcom/daaw/nc0;

    invoke-static {p1}, Lcom/daaw/nc0;->w(Lcom/daaw/nc0;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/al;

    invoke-virtual {p0, p1}, Lcom/daaw/nc0$f;->a(Lcom/daaw/al;)V

    return-void
.end method
