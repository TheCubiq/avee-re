.class public final synthetic Lcom/daaw/avee/-$$Lambda$MainActivity$i_DABTj1lyFM03D9yEWI3RZHKqA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/-$$Lambda$MainActivity$i_DABTj1lyFM03D9yEWI3RZHKqA;->f$0:Lcom/daaw/avee/MainActivity;

    return-void
.end method


# virtual methods
.method public final onInvoke(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/-$$Lambda$MainActivity$i_DABTj1lyFM03D9yEWI3RZHKqA;->f$0:Lcom/daaw/avee/MainActivity;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/MainActivity;->lambda$updateVizButtonVisibility$4$MainActivity(Ljava/lang/Integer;)V

    return-void
.end method
