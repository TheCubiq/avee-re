.class public final synthetic Lcom/daaw/ac0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ww1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/nc0;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/nc0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ac0;->a:Lcom/daaw/nc0;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ac0;->a:Lcom/daaw/nc0;

    check-cast p1, [Ljava/lang/Integer;

    invoke-static {v0, p1}, Lcom/daaw/nc0;->m(Lcom/daaw/nc0;[Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
