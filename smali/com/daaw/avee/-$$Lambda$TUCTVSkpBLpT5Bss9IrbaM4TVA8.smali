.class public final synthetic Lcom/daaw/avee/-$$Lambda$TUCTVSkpBLpT5Bss9IrbaM4TVA8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/Design/IAP2Design;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/Design/IAP2Design;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/-$$Lambda$TUCTVSkpBLpT5Bss9IrbaM4TVA8;->f$0:Lcom/daaw/avee/Design/IAP2Design;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/-$$Lambda$TUCTVSkpBLpT5Bss9IrbaM4TVA8;->f$0:Lcom/daaw/avee/Design/IAP2Design;

    invoke-virtual {v0}, Lcom/daaw/avee/Design/IAP2Design;->isPremium()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
