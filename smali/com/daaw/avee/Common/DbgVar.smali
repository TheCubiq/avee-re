.class public Lcom/daaw/avee/Common/DbgVar;
.super Ljava/lang/Object;
.source "DbgVar.java"


# static fields
.field static final enableDebug:Z = false


# instance fields
.field private stackTrace:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lcom/daaw/avee/Common/DbgVar;->stackTrace:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public assertDisposed(Lcom/daaw/avee/Common/Func/Func;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public assertDisposed(Z)V
    .locals 0

    return-void
.end method
