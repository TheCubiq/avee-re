.class public final Lcom/daaw/op1;
.super Lcom/daaw/pl;
.source ""


# static fields
.field public static final q:Lcom/daaw/op1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/op1;

    invoke-direct {v0}, Lcom/daaw/op1;-><init>()V

    sput-object v0, Lcom/daaw/op1;->q:Lcom/daaw/op1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/pl;-><init>()V

    return-void
.end method


# virtual methods
.method public T(Lcom/daaw/nl;Ljava/lang/Runnable;)V
    .locals 2

    sget-object p1, Lcom/daaw/tr;->w:Lcom/daaw/tr;

    sget-object v0, Lcom/daaw/ek1;->g:Lcom/daaw/uj1;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lcom/daaw/t81;->X(Ljava/lang/Runnable;Lcom/daaw/uj1;Z)V

    return-void
.end method
