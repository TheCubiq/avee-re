.class public final synthetic Landroidx/browser/customtabs/-$$Lambda$CustomTabsService$1$3KabmmsBQr_A7ceXhU8FiwltY6M;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field private final synthetic f$0:Landroidx/browser/customtabs/CustomTabsService$1;

.field private final synthetic f$1:Landroidx/browser/customtabs/CustomTabsSessionToken;


# direct methods
.method public synthetic constructor <init>(Landroidx/browser/customtabs/CustomTabsService$1;Landroidx/browser/customtabs/CustomTabsSessionToken;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/browser/customtabs/-$$Lambda$CustomTabsService$1$3KabmmsBQr_A7ceXhU8FiwltY6M;->f$0:Landroidx/browser/customtabs/CustomTabsService$1;

    iput-object p2, p0, Landroidx/browser/customtabs/-$$Lambda$CustomTabsService$1$3KabmmsBQr_A7ceXhU8FiwltY6M;->f$1:Landroidx/browser/customtabs/CustomTabsSessionToken;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 2

    iget-object v0, p0, Landroidx/browser/customtabs/-$$Lambda$CustomTabsService$1$3KabmmsBQr_A7ceXhU8FiwltY6M;->f$0:Landroidx/browser/customtabs/CustomTabsService$1;

    iget-object v1, p0, Landroidx/browser/customtabs/-$$Lambda$CustomTabsService$1$3KabmmsBQr_A7ceXhU8FiwltY6M;->f$1:Landroidx/browser/customtabs/CustomTabsSessionToken;

    invoke-virtual {v0, v1}, Landroidx/browser/customtabs/CustomTabsService$1;->lambda$newSessionInternal$0$CustomTabsService$1(Landroidx/browser/customtabs/CustomTabsSessionToken;)V

    return-void
.end method
